class Test
{
    static void ReserveName(String name) throws MeroException
    {
        if(name == "aadim")
        {
            throw new MeroException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("aadim");
        } 
        catch (MeroException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}