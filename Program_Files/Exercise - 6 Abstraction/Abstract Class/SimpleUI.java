abstract class UIElement {
    abstract void draw();
    abstract void onClick();
}

class Button extends UIElement {
    String label;
    
    Button(String label) {
        this.label = label;
    }
    
    @Override
    void draw() {
        System.out.println("[ " + label + " ]");
    }
    
    @Override
    void onClick() {
        System.out.println(label + " clicked!");
    }
}

class TextBox extends UIElement {
    String text = "";
    
    @Override
    void draw() {
        System.out.println("|" + (text.isEmpty() ? "______" : text) + "|");
    }
    
    @Override
    void onClick() {
        System.out.println("TextBox selected - ready for typing");
    }
}

public class SimpleUI {
    public static void main(String[] args) {
        UIElement loginBtn = new Button("Login");
        UIElement searchBox = new TextBox();
        
        // Draw UI
        loginBtn.draw();
        searchBox.draw();
        
        // Handle clicks
        loginBtn.onClick();
        searchBox.onClick();
    }
}