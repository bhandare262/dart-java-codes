void main(){
int unit = 150;
int cost = 0;
if(unit<0){
    print("enter valid unit");
}else if(unit>=0 && unit<=90){
    print("no charge");
}else if(unit>=91 && unit<=180){
    cost = 6*unit;
    print(cost);
}else if(unit>=181 && unit<=250){
    cost = 10*unit;
    print(cost);
}else{
    cost = 15*unit;
    print(cost);
}
}

