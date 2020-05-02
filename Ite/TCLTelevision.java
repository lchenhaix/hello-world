package Ite;

public class TCLTelevision implements Television {
	private Object[] obj= {"湖南卫视","北京卫视","浙江卫视","东方卫视","上海卫视"};
	public TVIterator createIterator() {
		return new TCLIterator();
	}
	private class TCLIterator implements TVIterator {
		private int currentIndex=0;
		public void next() {
			if(currentIndex<obj.length) {
				currentIndex++;
			}
		}
		@Override
		public void setChannel(int i) {
			// TODO 自动生成的方法存根
			currentIndex=i;
		}
		@Override
		public void previous() {
			// TODO 自动生成的方法存根
			if(currentIndex>0) {
				currentIndex--;
			}
		}
		@Override
		public boolean isLast() {
			// TODO 自动生成的方法存根
			return currentIndex==obj.length;
		}
		@Override
		public Object currentChannel() {
			// TODO 自动生成的方法存根
			return obj[currentIndex];
		}
		@Override
		public boolean isFirst() {
			// TODO 自动生成的方法存根
			return currentIndex==0;
		}
	}
}
