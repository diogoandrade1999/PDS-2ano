package P03;

public class Game implements JGaloInterface {

	private char[][] grid = new char[3][3];
	private char player;
	private int numJogadas;
	
	public Game() {
		for (int i=0; i<3; i++)
			for (int k=0; k<3; k++)
				this.grid[i][k] = '0';
		this.player = 'X';
		this.numJogadas = 0;
	}

	@Override
	public char getActualPlayer() {
		return this.player;
	}

	@Override
	public boolean setJogada(int lin, int col) {
		if(this.grid[lin-1][col-1] == '0') {
			this.grid[lin-1][col-1] = this.player;
			this.numJogadas++;
			if(player == 'X')
				player = 'O';
			else
				player = 'X';
			return true;
		}
		return false;
	}

	@Override
	public boolean isFinished() {
		if(checkResult() != 0)
			return true;
		return false;
	}

	@Override
	public char checkResult() {
		if(grid[0][0] != '0' && grid[0][0] == grid[0][1] && grid[0][0] == grid[0][2])
			return this.grid[0][0];
		else if(grid[1][0] != '0' && grid[1][0] == grid[1][1] && grid[1][0] == grid[1][2])
			return this.grid[1][0];
		else if(grid[2][0] != '0' && grid[2][0] == grid[2][1] && grid[2][0] == grid[2][2])
			return this.grid[2][0];
		else if(grid[0][0] != '0' && grid[0][0] == grid[1][1] && grid[0][0] == grid[2][2])
			return this.grid[0][0];
		else if(grid[0][2] != '0' && grid[0][2] == grid[1][1] && grid[0][2] == grid[2][0])
			return this.grid[0][2];
		else if(grid[0][0] != '0' && grid[0][0] == grid[1][0] && grid[0][0] == grid[2][0])
			return this.grid[0][0];
		else if(grid[0][1] != '0' && grid[0][1] == grid[1][1] && grid[0][1] == grid[2][1])
			return this.grid[0][1];
		else if(grid[0][2] != '0' && grid[0][2] == grid[1][2] && grid[0][2] == grid[2][2])
			return this.grid[0][2];
		else if(this.numJogadas == 9)
			return ' ';
		return 0;
	}

}
