package enumabstract;

public enum OrderState implements Deletable{

    NEW, CONFIRMED, PREPARED, ONBOARD, DELIVERED, RETURNED, DELETED;

    @Override
    public boolean canDelete() {
        if(this == NEW || this == CONFIRMED || this == PREPARED){
            return true;
        }
        return false;
    }
}
