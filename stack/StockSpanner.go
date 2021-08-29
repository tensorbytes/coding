type Stock struct {
	day   int
	price int
}

type StockSpanner struct {
	stock []Stock
	today int
}

func Constructor() StockSpanner {
	var Span StockSpanner
	Span.stock = append(Span.stock, Stock{0, 0})
	Span.today = 0
	return Span
}

func (this *StockSpanner) Next(price int) int {
	for len(this.stock) > 1 && this.stock[len(this.stock)-1].price <= price {
		this.stock = this.stock[:len(this.stock)-1]
	}
	result := this.today - this.stock[len(this.stock)-1].day + 1

	this.today++
	this.stock = append(this.stock, Stock{this.today, price})
	return result
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * obj := Constructor();
 * param_1 := obj.Next(price);
 */