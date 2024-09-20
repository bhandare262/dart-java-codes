void main(){
int x =5;
int y =6;
 
var ans = (++x < --y) || (x++ >++y); // 6<5 || 6 >6
print(ans);// false
print(x);//7
print(y);//6
}

