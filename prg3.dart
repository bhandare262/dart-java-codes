import "dart:io";
void main(){
 print("enter rows");
 int rows = int.parse(stdin.readLineSync()!);
  for(int i =0; i<rows;i++){
       int x = 1;
   for(int j=0; j<rows;j++){
       
            stdout.write(x++ );

            stdout.write(" " );
}
  print( "");
}
}
