import javax.swing.JOptionPane;


public class booleangroup {
	public static void main(String[] args) {
		String numbpeople = "";
		String numbplayer = "";
		boolean status = true;
		boolean	numbplayer1, numbpeople1;
		int x =3;
		int y=10;
		
		
		
		
		numbpeople = JOptionPane.showInputDialog("Enter number of people");
		numbplayer = JOptionPane.showInputDialog("Enter number of players");
		
		int numbgroupsize, numbpsize, numbpeople2, numbplayer2;
		
		
		numbpeople2 = Integer.parseInt(numbpeople);
		numbplayer2 = Integer.parseInt(numbplayer);

		//numbpeople1 = numbpeople2>10;
		//numbplayer1 = numbplayer2>11;
		
		int groupsize = numbplayer2+numbpeople2, 
				teamsize,
				teamsize1 = 1;
			
		
		if(numbpeople2>10) { 
			numbgroupsize= numbpeople2/2;
			JOptionPane.showMessageDialog(null,"The number of people " + numbpeople2 + ". " + "The number of group " + numbgroupsize );
			
			
		} else
			if(10>=numbpeople2 && numbpeople2>=3) {
			numbgroupsize = numbpeople2/3;
			JOptionPane.showMessageDialog(null,"The number of people " + numbpeople2 + ". " + "The number of group " + numbgroupsize );
		}
			else {
			JOptionPane.showMessageDialog(null,"The number of people has to be at least 3.");
		
	}
		if(11<=numbplayer2 && numbplayer2<=55) { 
			teamsize = numbplayer2/11;
			JOptionPane.showMessageDialog(null,"The number of player " + numbplayer2 + ". " + "The number of team size " + teamsize );
			
	} else { 
		JOptionPane.showMessageDialog(null,"The number of player " + numbplayer2 + ". " + "The number of team size " + teamsize1 );
	}
	
		
	}
	
	
}

