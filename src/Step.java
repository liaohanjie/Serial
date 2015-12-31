

import java.util.ArrayList;
import java.util.List;

import com.core.Serializer;

/**
 * 一个步操作对象
 * @author hanjie.l
 *
 */
public class Step extends Serializer{
	
	/**
	 * 消除的所有颜色方块
	 * {Remove.id  between 1 and 5}
	 */
	private List<Remove> removeSquare = new ArrayList<Remove>();
	
	/**
	 * 消除的所有其他道具
	 */
	private List<Remove> removeOtherGoods = new ArrayList<Remove>();
	

	public List<Remove> getRemoveSquare() {
		return removeSquare;
	}

	public void setRemoveSquare(List<Remove> removeSquare) {
		this.removeSquare = removeSquare;
	}

	public List<Remove> getRemoveOtherGoods() {
		return removeOtherGoods;
	}

	public void setRemoveOtherGoods(List<Remove> removeOtherGoods) {
		this.removeOtherGoods = removeOtherGoods;
	}

	@Override
	protected void read() {
		this.removeSquare = readList(Remove.class);
		this.removeOtherGoods = readList(Remove.class);
	}

	@Override
	public void write() {
		writeList(removeSquare);
		writeList(removeOtherGoods);
	}
	
	
}
