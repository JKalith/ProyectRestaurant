package ClassPackage;

public class Inventary {
    private String productCode;
    private String productName;
    private int amount;
    private int minAmount;
    private int suggestedPurchase;
    private int unitPrice;
    private int totalProductPrice;

    public Inventary() {
    }

    public Inventary(String productCode, String productName, int amount, int minAmount, int suggestedPurchase, int unitPrice, int totalProductPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.amount = amount;
        this.minAmount = minAmount;
        this.suggestedPurchase = suggestedPurchase;
        this.unitPrice = unitPrice;
        this.totalProductPrice = totalProductPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(int minAmount) {
        this.minAmount = minAmount;
    }

    public int getSuggestedPurchase() {
        return suggestedPurchase;
    }

    public void setSuggestedPurchase(int suggestedPurchase) {
        this.suggestedPurchase = suggestedPurchase;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getTotalProductPrice() {
        return totalProductPrice;
    }

    public void setTotalProductPrice(int totalProductPrice) {
        this.totalProductPrice = totalProductPrice;
    }

    @Override
    public String toString() {
        return "Inventary{" + "productCode=" + productCode + ", productName=" + productName + ", amount=" + amount + ", minAmount=" + minAmount + ", suggestedPurchase=" + suggestedPurchase + ", unitPrice=" + unitPrice + ", totalProductPrice=" + totalProductPrice + '}';
    }

    public String addDatta() {
        return  productCode + "," + productName + "," + amount + "," + minAmount + "," + suggestedPurchase + "," + unitPrice + "," + totalProductPrice;
    }

    
    
}
