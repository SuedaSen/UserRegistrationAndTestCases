
//In our lecture I asked that if it can be private or not
//So I decided to do my questions OOP concepts =)
		
public class ProfileInformation {
	private String userName;
	private String userPassword;//Not only integer, also can be characters as well
	private String userImageName;
	private String userImageFormat;//Jpeg or Jpg but it should be case sensitive also. =)
	private int width;//For resolution
	private int height;//For resolution
	private int fileSize;//Ask user
	private ProfileInformation profil; 
	private String resolution;
	public ProfileInformation()
	{
		this.userName=userName;
		this.userPassword=userPassword;
		this.userImageFormat=userImageFormat;
		this.userImageName=userImageName;
		this.width=width;
		this.height=height;
		this.fileSize=fileSize;
		this.profil=profil;
		this.resolution=resolution;
	}
	public ProfileInformation(String userName, String userPassword, String userImageName, String userImageFormat, int width, int height, int fileSize, String resolution ) { //They are private so I should open constructor
		// TODO Auto-generated constructor stub
		this.userName=userName;
		this.userPassword=userPassword;
		this.userImageFormat=userImageFormat;
		this.userImageName=userImageName;
		this.width=width;
		this.height=height;
		this.fileSize=fileSize;
		this.resolution=resolution;
	}
	public String getUserName() {
        return userName;
    }
	public String getResolution() {
        return resolution;
    }
	public String getUserPassword() {
        return userPassword;
    }
	public String getUserImageFormat() {
        return userImageFormat;
    }
	public String getUserImageName() {
        return userImageName;
    }
	public int getWidth() {
        return width;
    }
	public int getHeight() {
        return height;
    }
	public int getFileSize() {
        return fileSize;
    }
	  public void setUserName(String userName) {
	        this.userName = userName;
	    }
	  public void setUserPassword(String userPassword) {
	        this.userPassword = userPassword;
	    }
	  public void setUserImageFormat(String userImageFormat) {
	        this.userImageFormat = userImageFormat;
	    }
	  public void setUserImageName(String userImageName) {
	        this.userImageName = userImageName;
	    }
	  public void setWidth(int width) {
	        this.width = width;
	    }
	  public void setHeight(int height) {
	        this.height = height;
	    }
	  public void setFileSize(int fileSize) {
	        this.fileSize = fileSize;
	    }
	  public void setResolution(String resolution) {
	        this.resolution = resolution;
	    }
	
	public int calculateResolution()
	{
		//System.out.print("Height X Length: "+ getHeight() + "X" +getLength() );
	     int resolution=1;
		resolution=getHeight()*getWidth();
		return resolution;
	}
	public String profileUserDetails()
	{
		//System.out.println("Hello Dear User =) Details of your profile are as below ");

		System.out.println();
		return "Profile User Detais"+ " UserName: " + getUserName().toString()+ "  User Password " + getUserPassword().toString();
		
	}
	public String profilePhotoDetails()
	{
		//System.out.println("Hello Dear User =) Details of your profile photo are as below ");
		System.out.println();
		return "Profile Photos Details: "+  " Name of the photo: " + getUserImageName().toString() + " Format of photo "+ getUserImageFormat().toString() + " File is: " + getUserImageName().toString() +"."+ getUserImageFormat().toString() + " Size of photo: " + getFileSize() + "Kb"+ " Width of photo: " + getWidth() + " Height of photo "+ getHeight()+ " Height X Width: "+ getHeight() + "X" +getWidth() + " Resolution of photo is: "+ calculateResolution() + "also" + getResolution();
	}
}

