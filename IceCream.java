class IceCream{
static String iceCream="chocolate";
static String iceCream1="strawberry";
static String iceCream2="butterscotch";
static String iceCream3="vanilla";
static String iceCream4="banana";
static String iceCream5="coconut";
static String iceCreamFlavours[]={iceCream,iceCream1,iceCream2,iceCream3,iceCream4,iceCream5};
static int index;
public static boolean addIceCream(String iceCream){
boolean isAdded=false;
if(iceCream!=null){
	iceCreamFlavours[index]=iceCream;
    index++;
    isAdded=true;	
}else{
	System.out.println("cannot addIcream,as it is a null value");
}
return isAdded;
}
public static void gainAllIceCreamFlavours(){
	System.out.println("invoking gainAllIceCreamFlavours");
	for(int iceCream=0;iceCream<iceCreamFlavours.length;iceCream++){
	String reference=iceCreamFlavours[iceCream];
     System.out.println(reference);	
		}
	System.out.println("ending gainAllIceCreamFlavours");
	}
}
public static boolean updateIceCreamName(String existingIceCreamName,String updatedIceCreamName){
boolean isUpdated=false;
for(int iceCream=0,iceCream<iceCreamNames.length;iceCream++){
if(iceCreamNames[iceCreamIndex].equals(existingIceCreamName))	{
iceCreamNames[iceCreamindex]=updatedIceCreamName;
isUpdated=true;	
	
	
}
	
	
}	
returrn isUpdated;	
	
	
}














