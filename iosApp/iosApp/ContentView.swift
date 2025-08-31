import SwiftUI
import shared

struct ContentView: View {
	//let greet = Greeting().greet()
	let phrases = Greeting().greet()

	var body: some View {
		List(phrases, id:\.self){
			Text($0)
		}
		//Text(greet)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}