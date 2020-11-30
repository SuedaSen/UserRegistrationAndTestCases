import java.util.Scanner;

public class UserMain {

		public static void main(String[] args) {
			ProfileInformation profil=new ProfileInformation();
			Scanner scanner=new Scanner(System.in);
			System.out.print("Please enter the username : ");
			String username=scanner.nextLine();
			System.out.print("Please enter the password : ");
			String password=scanner.nextLine();
			System.out.print("Please enter the image name : ");
			String userImageName=scanner.nextLine();
			System.out.print("Please enter the image format : ");
			String userImageFormat=scanner.nextLine();
			System.out.print("Please enter the width of the image : ");
			int width=scanner.nextInt();
			System.out.print("Please enter the height of the image : ");
			int height=scanner.nextInt();
			System.out.print("Please enter the size of the file (kB Format) : ");
			int filesize=scanner.nextInt();
			System.out.print("Please enter the resolution string format) : ");
			String resolution=scanner.nextLine();
			ProfileInformation profile= new ProfileInformation(username,password,userImageName,userImageFormat,width,height,filesize,resolution);
			profile.calculateResolution();//Resolution
			//ProfileInformation profil=new ProfileInformation();
			
			/*
			//--------------------------------------UserName----------------------------------------------
           
			if(profile.getUserName().length()>10) {
				System.out.println("Username must be less than 10 characters");
				while(true) {
					 username=scanner.nextLine();
					 profile.setUserName(username);
					if(profile.getUserName().length()>10) {
						System.out.println("Username must be less than 10 characters");
						continue;
					}
					else {
						break;
					}
				}
			}
			*/
			//--------------------------------------UserPassword----------------------------------------------

			if(profile.getUserPassword().length()<5 || profile.getUserPassword().length()>10) {
				System.out.println("Password must be between 5 and 10 characters");
				while(true) {
					System.out.print("Enter password : ");
					password = scanner.nextLine();
					profile.setUserPassword(password);
					if(profile.getUserPassword().length()<5 || profile.getUserPassword().length()>10) {
						System.out.println("Password must be between 5 and 10 characters");
						continue;
					}
					else {
						break;
					}
				}
			}
			
		//--------------------------------------ImageFormat----------------------------------------------
			if(profile.getUserImageFormat().toString().equalsIgnoreCase("Jpeg")==false || profile.getUserImageFormat().toString().equalsIgnoreCase("Jpg")==false)// I ignored the case sensivity
			{
				System.out.println("File format must be jpg or jpeg, please make sure that");
			}
			
		//--------------------------------------FileSize----------------------------------------------

			if (profile.getFileSize()>20) {
				System.out.println("Size must be less than 20 kb");
				while(true) {
					System.out.print("Enter size : ");
					filesize = scanner.nextInt();
					profile.setFileSize(filesize);
					if (profile.getFileSize()>20) {
						System.out.println("Size must be less than 20 kb");
						continue;
					}
					else {
						break;
					}
				}
			}
			
		//--------------------------------------Resolution----------------------------------------------

			if (profile.calculateResolution()>250000) {
				System.out.println("Wide must be less than 500X500 pixels");
				while (true) {
					System.out.println("Enter width again please in order to calculating resolution");
					width=scanner.nextInt();
					System.out.println("Enter height again please in order to calculating resolution");
					 height=scanner.nextInt();
					 profile.setHeight(height);
					 profile.setWidth(width);
					 profile.calculateResolution();
					if (profile.calculateResolution()>500) {
						System.out.println("Wide must be less than 500X500 pixels");
						continue;
					}
					else {
						break;
					}
				}
			}
		System.out.println("********************************************************");
		System.out.println("Hello Dear User =) Details of your profile are as below ");
		System.out.println(profile.profileUserDetails().toString());
		System.out.println("********************************************************");
  		System.out.println("Hello Dear User =) Details of your profile photo are as below ");
  		System.out.println(profile.profilePhotoDetails().toString());
		System.out.println("********************************************************");

			
		}
	}



