package afp;

//Abstract Factory Interface
interface UIComponentFactory {
 Button createButton();
 TextField createTextField();
}

//Concrete Factory for Windows UI Components
class WindowsUIComponentFactory implements UIComponentFactory {
 @Override
 public Button createButton() {
     return new WindowsButton();
 }

 @Override
 public TextField createTextField() {
     return new WindowsTextField();
 }
}

//Concrete Factory for macOS UI Components
class MacOSUIComponentFactory implements UIComponentFactory {
 @Override
 public Button createButton() {
     return new MacOSButton();
 }

 @Override
 public TextField createTextField() {
     return new MacOSTextField();
 }
}

//Abstract Product: Button
interface Button {
 void render();
}

//Concrete Product: Windows Button
class WindowsButton implements Button {
 @Override
 public void render() {
     System.out.println("Rendering Windows Button");
 }
}

//Concrete Product: MacOS Button
class MacOSButton implements Button {
 @Override
 public void render() {
     System.out.println("Rendering MacOS Button");
 }
}

//Abstract Product: TextField
interface TextField {
 void render();
}

//Concrete Product: Windows TextField
class WindowsTextField implements TextField {
 @Override
 public void render() {
     System.out.println("Rendering Windows TextField");
 }
}

//Concrete Product: MacOS TextField
class MacOSTextField implements TextField {
 @Override
 public void render() {
     System.out.println("Rendering MacOS TextField");
 }
}

//Client Code
public class Client {
 public static void main(String[] args) {
     // Create a factory for Windows UI components
     UIComponentFactory windowsFactory = new WindowsUIComponentFactory();

     // Create UI components
     Button windowsButton = windowsFactory.createButton();
     TextField windowsTextField = windowsFactory.createTextField();

     // Render UI components
     windowsButton.render();
     windowsTextField.render();

     // Similarly, we can create a factory for MacOS UI components and render them
 }
}
