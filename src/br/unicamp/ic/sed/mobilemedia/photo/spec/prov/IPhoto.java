package br.unicamp.ic.sed.mobilemedia.photo.spec.prov;

import javax.microedition.lcdui.Image;


public interface IPhoto{

	public String getAddedPhotoName (); 
	
	public String getAddedPhotoPath (  ); 
	 
	public String getNewLabel(); 
	
	public String getSelectedPhoto (  );
	
	public void initAddPhotoToAlbum (String albumName);
	
	public void initEditLabelScreen(); 

	public void initPhotoListScreen ( String[] imageNames );
	
	public void initPhotoViewScreen ( Image image );

	
}