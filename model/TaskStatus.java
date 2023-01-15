package model;

public enum TaskStatus {
    FINISH,DUE,IN_PROGRESS;

    @Override
    public String toString() {
        switch (this){
            case FINISH:
                return "finish";
            case DUE:
                return "due";
            case IN_PROGRESS:
                return "In progress";
            default:
                return "";
        }
    }
}
