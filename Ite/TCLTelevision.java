package Ite;

public class TCLTelevision implements Television {
	private Object[] obj= {"��������","��������","�㽭����","��������","�Ϻ�����"};
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
			// TODO �Զ����ɵķ������
			currentIndex=i;
		}
		@Override
		public void previous() {
			// TODO �Զ����ɵķ������
			if(currentIndex>0) {
				currentIndex--;
			}
		}
		@Override
		public boolean isLast() {
			// TODO �Զ����ɵķ������
			return currentIndex==obj.length;
		}
		@Override
		public Object currentChannel() {
			// TODO �Զ����ɵķ������
			return obj[currentIndex];
		}
		@Override
		public boolean isFirst() {
			// TODO �Զ����ɵķ������
			return currentIndex==0;
		}
	}
}
