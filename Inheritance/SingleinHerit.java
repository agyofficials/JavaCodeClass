class Hello{
    public void Hey(){
        System.out.println("Hello, from Hey");
    }
}
class SingleinHerit extends Hello{
    public static void main(String[] args) {
        SingleinHerit fetch_info = new SingleinHerit();
        fetch_info.Hey();
    }
}