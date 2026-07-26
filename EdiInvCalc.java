import java.util.*;
import java.util.stream.Collectors;

public class EdiInvCalc {
    public static void main(String[] args) {
        List<EdiInv> ediInvs = new ArrayList<>(
                Arrays.asList(
                        new EdiInv("1", "PO98765", "UPC123456", "LOC789", "VENDOR001", "100"),
                        new EdiInv("1", "PO98765", "UPC123456", "LOC789", "VENDOR001", "100"),
                        new EdiInv("2", "PO54321", "UPC654321", "LOC456", "VENDOR002", "300"),
                        new EdiInv("5", "PO77889", "UPC777888", "LOC654", "VENDOR005", "420"),
                        new EdiInv("6", "PO66778", "UPC666777", "LOC159", "VENDOR010", "100"),
                        new EdiInv("6", "PO66778", "UPC666777", "LOC159", "VENDOR010", "50")
                )
        );

//        List<EdiInv> filteredData = ediInvs.stream()
//                .collect(Collectors.groupingBy(
//                        edi -> edi.getSimsPoId() + "|" + edi.getUpc() + "|" + edi.getVndrId(),  // Grouping key
//                        Collectors.summingInt(edi -> Integer.parseInt(edi.getQtyShipped()))     // Sum qtyShipped
//                ))
//                .entrySet()
//                .stream()
//                .flatMap(entry -> {
//                    String[] keys = entry.getKey().split("\\|");  // Extract simsPoId, upc, vndrId
//                    int qtyInv = entry.getValue();               // Get summed qtyShipped
//
//                    return ediInvs.stream()
//                            .filter(edi -> edi.getSimsPoId().equals(keys[0]) &&
//                                    edi.getUpc().equals(keys[1]) &&
//                                    edi.getVndrId().equals(keys[2]))  // Match grouped keys
//                            .map(edi -> new EdiInv(edi.getNdc(), edi.getSimsPoId(), edi.getUpc(), edi.getLocNbr(),
//                                    edi.getVndrId(), edi.getQtyShipped(), String.valueOf(qtyInv)));  // Add qtyInv
//                })
//                .collect(Collectors.toList());


//        filteredData.stream().distinct(Comparator.comparing())

        List<EdiInv> groupedList = ediInvs.stream()
                .collect(Collectors.groupingBy(
                        bean -> bean.getSimsPoId() + "_" + bean.getUpc() + "_" + bean.getVndrId(), // Group by simsPoId, upc, vndrId
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> {
                                    double totalQty = list.stream()
                                            .mapToDouble(a -> Double.parseDouble(a.getQtyShipped()))
                                            .sum();  // Sum qtyShipped

                                    EdiInv first = list.get(0);  // Pick the first record in the group

                                    return new EdiInv(first.getNdc(), first.getSimsPoId(), first.getUpc(), first.getLocNbr(),
                                            first.getVndrId(), first.getQtyShipped(), String.valueOf(totalQty)); // Set qtyInv
                                }
                        )
                ))
                .values()
                .stream()
                .collect(Collectors.toList());  // Convert to List

        groupedList.forEach(System.out::println);

    }
}
