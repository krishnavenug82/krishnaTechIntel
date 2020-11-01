package fascadeDesignPattern.exampleTwo.asia;

public class ServiceLocator {
	
/*1) Why we call it as service locator? 
1.1) The below variables are not data,  this is service of CitiBank and IciciBank and HdfcBank, which are containing datas and methods.
1.2) All service are located in single then which will be called by another method */
	   
	public CitiBankEmiService citiBankServicel = new CitiBankEmiService();
	public IciciBankEmiService iciciBankServicel = new IciciBankEmiService();
	public HdfcBankEmiService hdfcBankServicel = new HdfcBankEmiService();

}
