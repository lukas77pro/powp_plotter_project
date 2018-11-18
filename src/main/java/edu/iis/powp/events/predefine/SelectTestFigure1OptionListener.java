package edu.iis.powp.events.predefine;

import edu.iis.client.plottermagic.preset.FiguresJoe;
import edu.iis.powp.app.DriverManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectTestFigure1OptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigure1OptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		FiguresJoe.figureScript1(driverManager.getCurrentPlotter());
	}
}