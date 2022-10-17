package behavioural.state;

/**
 * Abstract name is Context
 */

public class Canvas {
    private Tool currentTool;

    public void mouseUp() {
        currentTool.mouseUp();
    }

    public void mouseDown() {
        currentTool.mouseDown();
    }


    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDownDeprecated() {
        /**
         * The bove one id more efficient , higly scalable and maintainable
         * It makes use of polymorphism
         * it also involves programming with interface hence loose coupling
         * Saves you from too much decision making
         * Represent the onMousePress event
         */

        /*
            //  This could work fine however it's not extensible i.e to add a tool you have to make
            a lot of changes in many places
            //  And bulk code two where we have more tools
        if (currentTool == ToolType.SELECTION) {
            System.out.println("Selection icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush Icon");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Eraser icon");
        }*/
    }

    public void mouseUpDeprecated() {
        /**
         *  * The bove one id more efficient , higly scalable and maintainable
         *  It makes use of polymorphism
         *   it also involves programming with interface hence loose coupling
         *   saves you from too much decision making
         * Represent the onMouseRelease event
         */
        /*if (currentTool == ToolType.SELECTION) {
            System.out.println("Draw Rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Draw line");
        } else if (currentTool == ToolType.ERASER) {
            System.out.println("Erase Something");
        }*/
    }
}
