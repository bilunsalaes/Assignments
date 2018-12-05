public class CraftyCreations
{
        public double materials;
        public double hours;
        public double shipping;
        public String ProductName;
        
        //Use these in the future in case they never change.  At the moment they are optional.
        public void setMaterials(double materials)
        {
        materials = materials;
        }
        public double getMaterials()
        {
        return materials;
        }
        public void setHours(double hours)
        {
        hours = hours;
        }
        public double getHours()
        {
        return hours;
        }
        public void setShipping(double shipping)
        {
        shipping = shipping;
        }
        public double getShipping()
        {  
        return shipping;
        }
        
        public void setProductName(String ProductName)
        {
        ProductName = ProductName;
        }
        public String getProductName()
        {
        return ProductName;
        }
}         