package org.example;

// This interface should be implemented by existing TransactionProcessing and the new Kafka TransactionProcessor
public interface TransactionProcessor {

    public boolean sendMessage(String switchType, String msg);
}
