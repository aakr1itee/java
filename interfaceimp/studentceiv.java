class studentceiv extends std implements libraryhelper {
    studentceiv(String name, int roll, double marks)
    {
        super(name,roll,marks);
    }
    void attendclass(){
        System.out.println(name+" is attending class");
    }
    void giveexam(){
        System.out.println(name+" is giving exam");
    }
    void payfee(){
        System.out.println(name+" has paid the fee");
    }

    public void booksborrowed(){
        System.out.println(name+" borrowed 3 books");
    }
    void displayinfo(){
        System.out.println("name:"+name);
        System.out.println("roll:"+roll);
        System.out.println("marks:"+marks);
    }
    
}
