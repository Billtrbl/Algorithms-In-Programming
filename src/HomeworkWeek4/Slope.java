package HomeworkWeek4;

public double getSlope() {
	
    double x1 = p1.getX();
    double x2 = p2.getX();
    double y1 = p1.getY();
    double y2 = p2.getY();
    
    if (x1 == x2) {
        throw new IllegalStateException();
    } else if (y1 == y2) {
        return 0;
    } else {
        return (y2 - y1) / (x2 - x1);
    }
}
