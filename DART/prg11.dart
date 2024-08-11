void main(){
int x = 10;                                                                 int y = 20;

int ans = ++x + x++ + y++ ;   // 11 + 11 +20 
print(ans); //42

ans = --y + ++y; // 20 + 21
print(ans); // 41


print(x); //12
print(y); //21
}
