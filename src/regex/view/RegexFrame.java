package regex.view;

import regex.controller.RegexController;

public class RegexFrame
{
	private RegexController baseController;
	private RegexPanel appPanel;
	
	public RegexFrame(RegexController baseController)
	{
		super();
		this.baseController = baseController;
		appPanel = new RegexPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		
	}

}
