import java.io.IOException;

class ThrowsDemo {
    void myMethod(int num) throws IOException,ClassNotFoundException{
        if(num==1){
            throw new IOException("IOexcpetion occured");
        }else{
            throw new ClassNotFoundException("ClassNotFoundException");
        }
        
    }
}

class ExceptionExample{
    public static void main(String args[]){
        try{
            ThrowsDemo td = new ThrowsDemo();
            td.myMethod(2);
        }
        catch(Exception e){
            System.out.println(e);
        }
        try{
            int a[] = {1,2,3};
            System.out.println(a[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}