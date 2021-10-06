enum TicketPrice{
GANDHI(30,0f),MIDDLE(50,5f),BALCONY(100,0f),BOX(150,0f);
int price;
float tax;
TicketPrice(int price,float tax)
{
this.price=price;
this.tax=tax;


}


}