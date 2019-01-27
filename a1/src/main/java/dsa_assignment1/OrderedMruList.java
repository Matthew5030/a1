package dsa_assignment1;

public class OrderedMruList<E extends Comparable<E>> implements OrderedMruListInterface<E>
{
	MLNodeInterface<E>	headOrdered	= new MLNode<E>(null);//1
	MLNodeInterface<E>	headMRU		= new MLNode<E>(null);//2

	public OrderedMruList()
	{
	}
	
	public boolean isEmptyOrdered()
	{
		/* WRITE THIS CODE */
		if((headOrdered.getPrev1()==headOrdered)&&(headOrdered.getNext1()==headOrdered)) {
			return true;
		}
		return false;
	}

	public boolean isEmptyMru()
	{
		/* WRITE THIS CODE */
		if((headMRU.getPrev2()==headMRU)&&(headMRU.getNext2()==headMRU)) {
			return true;
		}
		return false;
	}

	public OrderedMruListInterface<E> touch(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
		return null;
	}
	
	public MLNodeInterface<E> getFirstMru()
	{
		if(!isEmptyMru()) {
			return headMRU;
		}
		return null;
	}
	
	public MLNodeInterface<E> getFirstOrdered()
	{
		/* WRITE THIS CODE */
		if(!isEmptyOrdered()) {
			return headOrdered;
		}
		return null;
	}
	
	public MLNodeInterface<E> getNextOrdered(MLNodeInterface<E> current)
	{
		/* WRITE THIS CODE */
		if(!isEmptyOrdered()) {
			return current.getNext1();
		}
		return null;
	}

	public MLNodeInterface<E> getNextMru(MLNodeInterface<E> current)
	{
		/* WRITE THIS CODE */
		if(!isEmptyMru()) {
			return current.getNext2();
		}
		return null;
	}

	public OrderedMruListInterface<E> remove(MLNodeInterface<E> target)
	{
		/* WRITE THIS CODE */
		target.remove1();
		target.remove2();
		return null;
	}
	
	public OrderedMruListInterface<E> add(E element)
	{
		/* WRITE THIS CODE */
		return null;
	}
}
