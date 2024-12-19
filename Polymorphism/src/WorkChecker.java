public class WorkChecker {
    private boolean hasWorkToDo;
    WorkChecker(boolean hasWorkToDo)
    {
        this.hasWorkToDo=hasWorkToDo;
    }
    WorkChecker()
    {
        this.hasWorkToDo=false;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}
