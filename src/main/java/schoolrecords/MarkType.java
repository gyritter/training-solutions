package schoolrecords;

import java.lang.reflect.Method;

public enum MarkType {
    A, B, C, D, F;

        public int getValue () {

        int value=0;

        return value;
    }

    String description = "";

    public String getDescription(MarkType mark) {

        switch (mark) {
            case A:
                description = "excellent(5)";
                break;
            case B:
                description = "very good(4)";
                break;
            case C:
                description = "improvement needed(3)";
                break;
            case D:
                description = "close fail(2)";
                break;
            case F:
                description = "fail(1)";
                break;
        }

        return description;
    }

}
