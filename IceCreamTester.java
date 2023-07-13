class IceCreamTester{
	public static void main(String[] args){
	IceCream.addIceCream("chocolate");
    IceCream.addIceCream("strawberry");
    IceCream.addIceCream("butterscotch");	
	IceCream.addIceCream("vanilla");
    IceCream.addIceCream("banana");
    IceCream.addIceCream("coconut");	
		
	IceCream.gainAllIceCreamFlavours();	
		
	




boolean updatedName=IceCream.updateIceCreamName("chocolate","chocolate chip");
System.out.println(updatedName);
IceCream.gainAllIceCreamFlavours();	
	}
}