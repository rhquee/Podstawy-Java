package academy;

/**
 * Created by RENT on 2017-04-11.
 */
public enum StudentState {
    APPLIED (false, "ZAAPLIKOWAL"),
    ACTIVE (true, "AKTYWNY"),
    SUSSPEND (false, "ZAWIESZONY"),
    GRADUATED(false, "ABSOLWENT");

    public boolean hasRoghtForStipend;
    public String translated;

    StudentState(boolean b, String t){
        this.hasRoghtForStipend = b;
        this.translated = t;
    }
}
