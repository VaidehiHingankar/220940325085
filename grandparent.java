class GrandParent
{
    
    String grandFartherName;
    String grandMotherName;
    GrandParent()
    
{
}    
    GrandParent(String GF , String GM)
    
{
    this.GrandFatherName = GF;
    this.GrandMotherName = GM ; 
    System.out.println("the name of grand Father is : +grandFatherName");
     System.out.println("the name of grand Mother is : +grandMotherName");
    
}
}
class Parent extends GrandParents
{
    
   String fatherName;
     String MotherName;
     Parents()
     {
     }
     
     parent (string FN , String MN, String GF, String GM)
     {
         this(GF , GM);
         this.fatherName = FN;
         his.MotherName = MM;
         
          System.out.println("the name of  Father is : +FatherName");
     System.out.println("the name of  Mother is : +MotherName");
    
     }
     
     Parent(String grand_father , String grand_mothe)
     
     {
         super(grand_father, grand_mother);
     }
}

class child extend parent
{
    
    public static void main (string args[])
    {
        parent obj = new Parent("ram","shyam","seeta","geeta");
    }
    
}
