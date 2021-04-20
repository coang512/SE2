package sad.humanresourcemanagementsystem.model;

public class staffInTrainning {
   private String fullName;
   private String trainningPro;
   private int supportMoney;
   private String description;
   private int sit_id;
public int getSit_id() {
	return sit_id;
}
public void setSit_id(int sit_id) {
	this.sit_id = sit_id;
}

public staffInTrainning(String fullName, String trainningPro, int supportMoney, String description, int sit_id) {
	super();
	this.fullName = fullName;
	this.trainningPro = trainningPro;
	this.supportMoney = supportMoney;
	this.description = description;
	this.sit_id = sit_id;
}
public staffInTrainning() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getTrainningPro() {
	return trainningPro;
}
public void setTrainningPro(String trainningPro) {
	this.trainningPro = trainningPro;
}
public int getSupportMoney() {
	return supportMoney;
}
public void setSupportMoney(int supportMoney) {
	this.supportMoney = supportMoney;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}

}
