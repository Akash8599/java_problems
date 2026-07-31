package common;

public class EdiInv {
    private String ndc;
    private String simsPoId;

    private String upc;
    private String locNbr;
    private String vndrId;
    private String qtyShipped;

    private String qntyInv;

    public String getQntyInv() {
        return qntyInv;
    }


    public EdiInv(String ndc, String simsPoId, String upc, String locNbr, String vndrId, String qtyShipped, String qntyInv) {
        this.ndc = ndc;
        this.simsPoId = simsPoId;
        this.upc = upc;
        this.locNbr = locNbr;
        this.vndrId = vndrId;
        this.qtyShipped = qtyShipped;
        this.qntyInv = qntyInv;
    }

    public void setQntyInv(String qntyInv) {
        this.qntyInv = qntyInv;
    }

    public EdiInv(String ndc, String simsPoId, String upc, String locNbr, String vndrId, String qtyShipped) {
        this.ndc = ndc;
        this.simsPoId = simsPoId;
        this.upc = upc;
        this.locNbr = locNbr;
        this.vndrId = vndrId;
        this.qtyShipped = qtyShipped;
    }

    public String getNdc() {
        return ndc;
    }

    public void setNdc(String ndc) {
        this.ndc = ndc;
    }

    public String getSimsPoId() {
        return simsPoId;
    }

    public void setSimsPoId(String simsPoId) {
        this.simsPoId = simsPoId;
    }

    public String getUpc() {
        return upc;
    }

    public void setUpc(String upc) {
        this.upc = upc;
    }

    public String getLocNbr() {
        return locNbr;
    }

    public void setLocNbr(String locNbr) {
        this.locNbr = locNbr;
    }

    public String getVndrId() {
        return vndrId;
    }

    public void setVndrId(String vndrId) {
        this.vndrId = vndrId;
    }

    public String getQtyShipped() {
        return qtyShipped;
    }

    public void setQtyShipped(String qtyShipped) {
        this.qtyShipped = qtyShipped;
    }

    @Override
    public String toString() {
        return "EdiInv{" +
                "ndc='" + ndc + '\'' +
                ", simsPoId='" + simsPoId + '\'' +
                ", upc='" + upc + '\'' +
                ", locNbr='" + locNbr + '\'' +
                ", vndrId='" + vndrId + '\'' +
                ", qtyShipped='" + qtyShipped + '\'' +
                ", qntyInv='" + qntyInv + '\'' +
                '}';
    }
}
