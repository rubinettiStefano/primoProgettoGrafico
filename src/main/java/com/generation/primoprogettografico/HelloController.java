package com.generation.primoprogettografico;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class HelloController
{
	//devo creare una Proprietà dello stesso tipo dell'elemento
	//con il nome uguale all'id
	@FXML
	private Text ilMioTesto,testoCangiante;



	public void bottonePremuto()
	{
		ilMioTesto.setText("Mannaggina il bottone è stato premuto");
	}
	public void bottoneRosso()
	{
		testoCangiante.setFill(Color.RED);
	}
	public void bottoneVerde()
	{
		testoCangiante.setFill(Color.GREEN);
	}
	public void bottoneNero()
	{
		testoCangiante.setFill(Color.BLACK);
	}
}