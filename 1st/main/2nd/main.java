class main {
    public static void main(String[] args) {
        int i=1;
        int f=0;
        while(i<=20){
            if(i%2==0){
                f=f+i;
                i++;
            }
        }
        System.out.println(f);
    }
}
