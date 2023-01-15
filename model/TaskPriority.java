package model;

public enum TaskPriority {

    HIGH, MEDIUM,LOW;

    @Override
    public String toString() {
        switch (this){
            case HIGH:
                return "high";
            case MEDIUM:
                return "medium";
            case LOW:
                return "low";
            default:
                return "";
        }
    }
}
