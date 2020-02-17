package construction;

public class ConstructionCost {
	
	public double Cost(String standard_type, double area, boolean FullyAutomated) {
		double cost = area;
		if(standard_type=="standardMaterials" && FullyAutomated==false)
			cost*=1200;
		else if(standard_type=="aboveStandardMaterials" && FullyAutomated==false)
			cost*=1500;
		else if(standard_type=="highStandartMaterials" && FullyAutomated==false)
			cost*=1800;
		else if(standard_type=="highStandardsMaterials" && FullyAutomated==true)
			cost*=2500;
		return cost;
	}
	
}
