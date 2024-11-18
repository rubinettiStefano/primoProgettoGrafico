module com.generation.primoprogettografico {
	requires javafx.controls;
	requires javafx.fxml;


	opens com.generation.primoprogettografico to javafx.fxml;
	exports com.generation.primoprogettografico;
}