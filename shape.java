class Shape 
{
    
    void draw()
    {
        
        system.out.println("drawing..")
    }
    class rectangle extends shape 
    {
        void draw()
        
        System.out.println("drawing rectangle")
        
    }
    
    class circle extends Shape
    {
        
        void draw()
        
         System.out.println("drawing circle")
        
    }
    
    class traingle extends shape
    {
        
        void draw()
        
         System.out.println("drawing triangle")
        
    }
    
    class testpoly
    public static void main(String args[])
{
    shape s;
	s = new Rectangle()
    s.draw();
    s = new Circle();
    s.draw();
    s.new traingle();
    s.draw();
}
    
}


