public class Printer {
        private int paper;
        private int tonerVolume;

        public Printer(int paper, int tonerVolume) {
            this.paper = paper;
            this.tonerVolume = tonerVolume;
        }

        public int getPaper() {
            return this.paper;
        }

        public void print(int pages, int copies){
            int totalPages = pages * copies;

            if (this.paper >= totalPages && this.tonerVolume >= totalPages){
                this.paper -= totalPages;
                this.tonerVolume -= totalPages;
                System.out.println("Print complete, Paper left = " + this.paper + " sheets. Toner left = " + this.tonerVolume + "pages.");
            }
            else {
                System.out.println("Error not enough paper or not enough toner, please check system.");
            }
        }

        public int getToner() {
            return this.tonerVolume;
        }
}

