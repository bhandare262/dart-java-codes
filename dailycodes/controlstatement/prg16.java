class switchdemo{
        public static void main(String[] args){
                double num = 1.5;
                System.out.println("before switch");
                switch(num){
                        case 1.5 :
                        System.out.println("one");
                               break;                                                                          case 2.0 :                                                                                      System.out.println("two");
                               break;
                        case 2.5 :
                                System.out.println("three");
                                break;
                        default :
                                 System.out.println("In Default State");                               }                                                                                           System.out.println("after switch");
        }
}
