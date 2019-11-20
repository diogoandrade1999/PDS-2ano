package P10_1;

import java.util.*;

public abstract class LeilaoObserver {
	
	protected List<LeilaoSubject> subj = new ArrayList<>();
	
	public boolean addSubject(LeilaoSubject lsub) {
		if(subj.contains(lsub))
			return false;
		subj.add(lsub);
		return true;
	}
	
	public LeilaoSubject getLeilaoSubject(Produto prod) {
		for(LeilaoSubject sub : subj) {
			if(sub.getProduto().equals(prod))
				return sub;
		}
		return null;
	}

	public abstract void update(Produto prod);

}
