package Traffic_System;

enum Color{
    RED, GREEN, YELLOW
}
// class representing a traffic light that has colors red, green, yellow.
public class TrafficLight {
    private Color color;                   // current color of the traffic light
    // constructor to initialize the traffic light to red
    public TrafficLight(){
        this.color = Color.RED;
    }

    // getter method for current color of the traffic light
    public Color getColor(){
        return color;
    }
    // method for cycle the lights.
    public void cycle(){
        switch (color){
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
            case YELLOW:
                color = Color.RED;
                break;
        }
        System.out.println("Traffic light is now: " + color);
    }
}
