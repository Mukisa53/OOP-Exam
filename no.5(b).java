public class TransactionRecord {
    // Private fields
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String transactionTimestamp;

    // Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String transactionTimestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.transactionTimestamp = transactionTimestamp;
    }

    // Public getter for buyer TIN
    public String getBuyerTIN() {
        return buyerTIN;
    }

    // Public setter for buyer TIN
    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    // Public getter for seller TIN
    public String getSellerTIN() {
        return sellerTIN;
    }

    // Public setter for seller TIN
    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    // Public getter for invoice amount
    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    // Public setter for invoice amount
    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    // Public getter for transaction timestamp
    public String getTransactionTimestamp() {
        return transactionTimestamp;
    }

    // No setter for transaction timestamp to protect its integrity after creation
}

