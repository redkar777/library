package team4.library.project;

public class Library {
	
		private String library_id;
		private String library_pw;
		private int local_no;
		
		public String getLibrary_id() {
			return library_id;
		}
		public void setLibrary_id(String library_id) {
			this.library_id = library_id;
		}
		public String getLibrary_pw() {
			return library_pw;
		}
		public void setLibrary_pw(String library_pw) {
			this.library_pw = library_pw;
		}
		public int getLocal_no() {
			return local_no;
		}
		public void setLocal_no(int local_no) {
			this.local_no = local_no;
		}
		
		@Override
		public String toString() {
			return "Library [library_id=" + library_id + ", library_pw=" + library_pw + ", local_no=" + local_no + "]";
		}
}
