require_relative "confefe"

describe Confefe do
  describe "parse_file" do
    it "parses example files" do
      names_list = Confefe.parse_file("examples/names_list.cf")
      expect(names_list).to eq([
        "bob",
        "joe",
        "roy",
        "eva",
        "jane",
        "amy"
      ])
    end
  end
end